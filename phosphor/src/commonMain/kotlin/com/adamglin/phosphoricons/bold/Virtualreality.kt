package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Virtualreality: ImageVector
    get() {
        if (_virtualreality != null) {
            return _virtualreality!!
        }
        _virtualreality = Builder(name = "Virtualreality", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(127.0f, 104.73f)
                lineToRelative(-24.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.06f, 0.0f)
                lineToRelative(-24.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 79.0f, 95.27f)
                lineToRelative(13.0f, 30.27f)
                lineToRelative(13.0f, -30.27f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 127.0f, 104.73f)
                close()
                moveTo(256.0f, 128.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, true, -84.0f, 84.0f)
                lineTo(84.0f, 212.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 84.0f, 44.0f)
                horizontalLineToRelative(88.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 256.0f, 128.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, -60.0f)
                lineTo(84.0f, 68.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, 120.0f)
                horizontalLineToRelative(88.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 232.0f, 128.0f)
                close()
                moveTo(200.0f, 120.0f)
                arcToRelative(31.85f, 31.85f, 0.0f, false, true, -7.93f, 21.05f)
                lineToRelative(5.69f, 8.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 178.24f, 163.0f)
                lineToRelative(-7.91f, -11.06f)
                curveToRelative(-0.77f, 0.05f, -1.55f, 0.09f, -2.33f, 0.09f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(136.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(20.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 200.0f, 120.0f)
                close()
                moveTo(160.0f, 128.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _virtualreality!!
    }

private var _virtualreality: ImageVector? = null
