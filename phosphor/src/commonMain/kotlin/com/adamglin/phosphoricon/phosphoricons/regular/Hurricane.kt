package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Hurricane: ImageVector
    get() {
        if (_hurricane != null) {
            return _hurricane!!
        }
        _hurricane = Builder(name = "Hurricane", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 96.0f)
                close()
                moveTo(128.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 144.0f)
                close()
                moveTo(158.32f, 45.36f)
                lineTo(167.73f, 10.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 158.32f, 0.18f)
                arcTo(195.87f, 195.87f, 0.0f, false, false, 99.67f, 25.27f)
                curveTo(60.63f, 50.37f, 40.0f, 85.89f, 40.0f, 128.0f)
                arcToRelative(88.11f, 88.11f, 0.0f, false, false, 57.68f, 82.64f)
                lineToRelative(-9.41f, 35.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.41f, 9.88f)
                arcToRelative(195.87f, 195.87f, 0.0f, false, false, 58.65f, -25.09f)
                curveTo(195.37f, 205.63f, 216.0f, 170.11f, 216.0f, 128.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 158.32f, 45.36f)
                close()
                moveTo(148.06f, 217.0f)
                arcToRelative(184.14f, 184.14f, 0.0f, false, true, -40.68f, 19.37f)
                lineToRelative(7.73f, -29.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.67f, -9.79f)
                arcTo(72.06f, 72.06f, 0.0f, false, true, 56.0f, 128.0f)
                curveToRelative(0.0f, -36.77f, 17.48f, -66.72f, 51.94f, -89.0f)
                arcToRelative(184.14f, 184.14f, 0.0f, false, true, 40.68f, -19.37f)
                lineToRelative(-7.73f, 29.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.67f, 9.79f)
                arcTo(72.06f, 72.06f, 0.0f, false, true, 200.0f, 128.0f)
                curveTo(200.0f, 164.77f, 182.52f, 194.72f, 148.06f, 217.0f)
                close()
            }
        }
        .build()
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
