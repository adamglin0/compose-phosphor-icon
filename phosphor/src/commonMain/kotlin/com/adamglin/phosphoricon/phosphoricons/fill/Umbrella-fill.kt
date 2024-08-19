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

public val FillGroup.`Umbrella-fill`: ImageVector
    get() {
        if (`_umbrella-fill` != null) {
            return `_umbrella-fill`!!
        }
        `_umbrella-fill` = Builder(name = "Umbrella-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 126.63f)
                arcTo(112.21f, 112.21f, 0.0f, false, false, 128.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcTo(112.21f, 112.21f, 0.0f, false, false, 16.05f, 126.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 144.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(136.0f, 144.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -17.37f)
                close()
                moveTo(32.0f, 128.0f)
                arcToRelative(96.15f, 96.15f, 0.0f, false, true, 76.2f, -85.89f)
                curveTo(96.48f, 58.0f, 81.85f, 86.11f, 80.17f, 128.0f)
                lineTo(32.0f, 128.0f)
                close()
                moveTo(175.83f, 128.0f)
                curveToRelative(-1.68f, -41.89f, -16.31f, -70.0f, -28.0f, -85.94f)
                arcTo(96.07f, 96.07f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_umbrella-fill`!!
    }

private var `_umbrella-fill`: ImageVector? = null
