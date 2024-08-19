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

public val LightGroup.Rewindcircle: ImageVector
    get() {
        if (_rewindcircle != null) {
            return _rewindcircle!!
        }
        _rewindcircle = Builder(name = "Rewindcircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(174.68f, 86.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.28f, 0.57f)
                lineTo(122.0f, 122.0f)
                lineTo(122.0f, 92.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.6f, -4.8f)
                lineToRelative(-48.0f, 36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 9.6f)
                lineToRelative(48.0f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 122.0f, 164.0f)
                lineTo(122.0f, 134.0f)
                lineToRelative(46.4f, 34.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 178.0f, 164.0f)
                lineTo(178.0f, 92.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 174.68f, 86.63f)
                close()
                moveTo(110.0f, 152.0f)
                lineTo(78.0f, 128.0f)
                lineToRelative(32.0f, -24.0f)
                close()
                moveTo(166.0f, 152.0f)
                lineTo(134.0f, 128.0f)
                lineTo(166.0f, 104.0f)
                close()
            }
        }
        .build()
        return _rewindcircle!!
    }

private var _rewindcircle: ImageVector? = null
