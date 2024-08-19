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

public val RegularGroup.Rewindcircle: ImageVector
    get() {
        if (_rewindcircle != null) {
            return _rewindcircle!!
        }
        _rewindcircle = Builder(name = "Rewindcircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(115.58f, 84.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.38f, 0.76f)
                lineToRelative(-48.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 12.8f)
                lineToRelative(48.0f, 36.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(120.0f, 92.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 115.58f, 84.84f)
                close()
                moveTo(104.0f, 148.0f)
                lineTo(77.33f, 128.0f)
                lineTo(104.0f, 108.0f)
                close()
                moveTo(179.58f, 84.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.38f, 0.76f)
                lineToRelative(-48.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 12.8f)
                lineToRelative(48.0f, 36.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(184.0f, 92.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 179.58f, 84.84f)
                close()
                moveTo(168.0f, 148.0f)
                lineToRelative(-26.67f, -20.0f)
                lineTo(168.0f, 108.0f)
                close()
            }
        }
        .build()
        return _rewindcircle!!
    }

private var _rewindcircle: ImageVector? = null
