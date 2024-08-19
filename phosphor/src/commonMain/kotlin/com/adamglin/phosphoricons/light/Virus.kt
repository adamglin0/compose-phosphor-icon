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

public val LightGroup.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(name = "Virus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 108.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 134.0f, 108.0f)
                close()
                moveTo(108.0f, 122.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 108.0f, 122.0f)
                close()
                moveTo(190.0f, 128.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 190.0f, 128.0f)
                close()
                moveTo(142.0f, 176.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 142.0f, 176.0f)
                close()
                moveTo(240.0f, 122.0f)
                lineTo(221.8f, 122.0f)
                arcToRelative(93.57f, 93.57f, 0.0f, false, false, -23.26f, -56.06f)
                lineToRelative(13.7f, -13.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineToRelative(-13.7f, 13.7f)
                arcTo(93.57f, 93.57f, 0.0f, false, false, 134.0f, 34.2f)
                lineTo(134.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 34.2f)
                arcTo(93.57f, 93.57f, 0.0f, false, false, 65.94f, 57.46f)
                lineToRelative(-13.7f, -13.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineToRelative(13.7f, 13.7f)
                arcTo(93.57f, 93.57f, 0.0f, false, false, 34.2f, 122.0f)
                lineTo(16.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(34.2f, 134.0f)
                arcToRelative(93.57f, 93.57f, 0.0f, false, false, 23.26f, 56.06f)
                lineToRelative(-13.7f, 13.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(13.7f, -13.7f)
                arcTo(93.57f, 93.57f, 0.0f, false, false, 122.0f, 221.8f)
                lineTo(122.0f, 240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 221.8f)
                arcToRelative(93.57f, 93.57f, 0.0f, false, false, 56.06f, -23.26f)
                lineToRelative(13.7f, 13.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineToRelative(-13.7f, -13.7f)
                arcTo(93.57f, 93.57f, 0.0f, false, false, 221.8f, 134.0f)
                lineTo(240.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(128.0f, 210.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, true, true, 82.0f, -82.0f)
                arcTo(82.1f, 82.1f, 0.0f, false, true, 128.0f, 210.0f)
                close()
            }
        }
        .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
