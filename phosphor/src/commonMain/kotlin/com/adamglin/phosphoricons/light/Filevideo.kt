package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = Builder(name = "FileVideo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.24f, 83.76f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(146.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                lineTo(202.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 212.24f, 83.76f)
                close()
                moveTo(158.0f, 46.48f)
                lineTo(193.52f, 82.0f)
                lineTo(158.0f, 82.0f)
                close()
                moveTo(154.91f, 146.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.09f, 0.16f)
                lineTo(126.0f, 161.17f)
                lineTo(126.0f, 160.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(48.0f, 146.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineToRelative(-1.17f)
                lineToRelative(22.82f, 14.26f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 158.0f, 216.0f)
                lineTo(158.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 154.91f, 146.75f)
                close()
                moveTo(114.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(146.0f, 205.17f)
                lineTo(126.0f, 192.67f)
                lineTo(126.0f, 175.33f)
                lineToRelative(20.0f, -12.5f)
                close()
            }
        }
        .build()
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
