package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Virtualreality: ImageVector
    get() {
        if (_virtualreality != null) {
            return _virtualreality!!
        }
        _virtualreality = Builder(name = "Virtualreality", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.49f, 98.81f)
                lineToRelative(-24.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.0f, 0.0f)
                lineToRelative(-24.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, -5.62f)
                lineToRelative(16.51f, 44.0f)
                lineToRelative(16.51f, -44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, 5.62f)
                close()
                moveTo(256.0f, 128.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, true, -80.0f, 80.0f)
                lineTo(80.0f, 208.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 80.0f, 48.0f)
                horizontalLineToRelative(96.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 256.0f, 128.0f)
                close()
                moveTo(240.0f, 128.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, -64.0f)
                lineTo(80.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, 128.0f)
                horizontalLineToRelative(96.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 240.0f, 128.0f)
                close()
                moveTo(180.84f, 138.35f)
                lineTo(191.0f, 156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.9f, 7.94f)
                lineToRelative(-11.44f, -20.0f)
                curveToRelative(-0.53f, 0.0f, -1.07f, 0.05f, -1.61f, 0.05f)
                lineTo(152.0f, 143.99f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 16.84f, 50.35f)
                close()
                moveTo(152.0f, 128.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(152.0f, 104.0f)
                close()
            }
        }
        .build()
        return _virtualreality!!
    }

private var _virtualreality: ImageVector? = null
