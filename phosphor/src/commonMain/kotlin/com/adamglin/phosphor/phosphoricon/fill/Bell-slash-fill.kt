package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Bell-slash-fill`: ImageVector
    get() {
        if (`_bell-slash-fill` != null) {
            return `_bell-slash-fill`!!
        }
        `_bell-slash-fill` = Builder(name = "Bell-slash-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.84f, 192.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, true, -3.0f, 0.28f)
                lineTo(83.27f, 43.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.8f, -6.0f)
                arcTo(79.55f, 79.55f, 0.0f, false, true, 129.17f, 24.0f)
                curveTo(173.0f, 24.66f, 207.8f, 61.1f, 208.0f, 104.92f)
                curveToRelative(0.14f, 34.88f, 8.31f, 61.54f, 13.82f, 71.0f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 221.84f, 192.0f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.85f, 10.76f)
                lineTo(182.62f, 200.0f)
                lineTo(167.16f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -78.41f, 0.0f)
                lineTo(47.91f, 200.0f)
                arcToRelative(15.78f, 15.78f, 0.0f, false, true, -13.59f, -7.59f)
                arcToRelative(16.42f, 16.42f, 0.0f, false, true, -0.09f, -16.68f)
                curveToRelative(5.55f, -9.73f, 13.7f, -36.64f, 13.7f, -71.73f)
                arcTo(79.42f, 79.42f, 0.0f, false, true, 58.79f, 63.85f)
                lineTo(42.0f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.84f, 34.62f)
                close()
                moveTo(150.59f, 200.0f)
                lineTo(105.32f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 45.27f, 0.0f)
                close()
            }
        }
        .build()
        return `_bell-slash-fill`!!
    }

private var `_bell-slash-fill`: ImageVector? = null
