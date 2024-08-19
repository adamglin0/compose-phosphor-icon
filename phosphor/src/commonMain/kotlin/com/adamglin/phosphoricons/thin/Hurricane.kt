package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Hurricane: ImageVector
    get() {
        if (_hurricane != null) {
            return _hurricane!!
        }
        _hurricane = Builder(name = "Hurricane", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 100.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(153.49f, 47.94f)
                lineTo(163.87f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.71f, -4.94f)
                arcToRelative(191.41f, 191.41f, 0.0f, false, false, -57.32f, 24.54f)
                curveTo(64.0f, 53.0f, 44.0f, 87.32f, 44.0f, 128.0f)
                arcToRelative(84.08f, 84.08f, 0.0f, false, false, 58.51f, 80.06f)
                lineTo(92.13f, 247.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.71f, 4.94f)
                arcToRelative(191.28f, 191.28f, 0.0f, false, false, 57.32f, -24.55f)
                curveTo(192.0f, 203.0f, 212.0f, 168.68f, 212.0f, 128.0f)
                arcTo(84.08f, 84.08f, 0.0f, false, false, 153.49f, 47.94f)
                close()
                moveTo(150.0f, 220.51f)
                arcToRelative(190.13f, 190.13f, 0.0f, false, true, -48.39f, 21.87f)
                lineToRelative(9.61f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.84f, -4.9f)
                arcTo(76.06f, 76.06f, 0.0f, false, true, 52.0f, 128.0f)
                curveToRelative(0.0f, -38.29f, 18.16f, -69.41f, 54.0f, -92.51f)
                arcToRelative(190.13f, 190.13f, 0.0f, false, true, 48.39f, -21.87f)
                lineToRelative(-9.61f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.84f, 4.9f)
                arcTo(76.06f, 76.06f, 0.0f, false, true, 204.0f, 128.0f)
                curveTo(204.0f, 166.29f, 185.84f, 197.41f, 150.0f, 220.51f)
                close()
            }
        }
        .build()
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
