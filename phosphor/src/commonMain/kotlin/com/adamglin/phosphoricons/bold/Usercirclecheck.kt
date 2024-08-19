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

public val BoldGroup.Usercirclecheck: ImageVector
    get() {
        if (_usercirclecheck != null) {
            return _usercirclecheck!!
        }
        _usercirclecheck = Builder(name = "Usercirclecheck", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.69f, 100.17f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 210.84f, 114.0f)
                arcTo(85.0f, 85.0f, 0.0f, false, true, 212.0f, 128.0f)
                arcTo(83.57f, 83.57f, 0.0f, false, true, 194.0f, 179.94f)
                arcToRelative(83.48f, 83.48f, 0.0f, false, false, -29.0f, -23.42f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -74.0f, 0.0f)
                arcToRelative(83.48f, 83.48f, 0.0f, false, false, -29.0f, 23.42f)
                arcTo(83.94f, 83.94f, 0.0f, false, true, 128.0f, 44.0f)
                arcToRelative(85.0f, 85.0f, 0.0f, false, true, 14.0f, 1.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.0f, -23.67f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 20.0f, 128.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, 216.0f, 0.0f)
                arcToRelative(109.19f, 109.19f, 0.0f, false, false, -1.49f, -18.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 220.69f, 100.17f)
                close()
                moveTo(100.0f, 120.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 120.0f)
                close()
                moveTo(79.57f, 196.57f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 96.86f, 0.0f)
                arcToRelative(83.72f, 83.72f, 0.0f, false, true, -96.86f, 0.0f)
                close()
                moveTo(240.49f, 48.49f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(200.0f, 55.0f)
                lineToRelative(23.51f, -23.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _usercirclecheck!!
    }

private var _usercirclecheck: ImageVector? = null
