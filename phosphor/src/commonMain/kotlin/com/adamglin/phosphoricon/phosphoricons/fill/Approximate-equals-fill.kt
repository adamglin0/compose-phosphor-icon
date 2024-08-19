package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Approximate-equals-fill`: ImageVector
    get() {
        if (`_approximate-equals-fill` != null) {
            return `_approximate-equals-fill`!!
        }
        `_approximate-equals-fill` = Builder(name = "Approximate-equals-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(197.2f, 160.87f)
                curveToRelative(-13.07f, 11.18f, -24.9f, 15.1f, -35.64f, 15.1f)
                curveToRelative(-14.26f, 0.0f, -26.62f, -6.92f, -37.47f, -13.0f)
                curveToRelative(-18.41f, -10.31f, -32.95f, -18.45f, -54.89f, 0.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.4f, -12.16f)
                curveToRelative(30.42f, -26.0f, 54.09f, -12.76f, 73.11f, -2.11f)
                curveToRelative(18.41f, 10.31f, 33.0f, 18.45f, 54.89f, -0.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.4f, 12.16f)
                close()
                moveTo(197.2f, 104.87f)
                curveToRelative(-13.07f, 11.18f, -24.9f, 15.1f, -35.64f, 15.1f)
                curveToRelative(-14.26f, 0.0f, -26.62f, -6.92f, -37.47f, -13.0f)
                curveToRelative(-18.41f, -10.31f, -32.95f, -18.45f, -54.89f, 0.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 58.8f, 95.13f)
                curveToRelative(30.42f, -26.0f, 54.09f, -12.76f, 73.11f, -2.11f)
                curveToRelative(18.41f, 10.31f, 33.0f, 18.45f, 54.89f, -0.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.4f, 12.16f)
                close()
            }
        }
        .build()
        return `_approximate-equals-fill`!!
    }

private var `_approximate-equals-fill`: ImageVector? = null
