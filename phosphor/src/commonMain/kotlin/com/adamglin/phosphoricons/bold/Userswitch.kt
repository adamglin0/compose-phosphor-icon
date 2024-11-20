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

public val BoldGroup.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) {
            return _userSwitch!!
        }
        _userSwitch = Builder(name = "UserSwitch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.0f, 174.26f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 196.24f, 177.0f)
                quadToRelative(-1.47f, 2.06f, -3.05f, 4.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -30.0f, -28.37f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -70.28f, 0.08f)
                arcToRelative(76.8f, 76.8f, 0.0f, false, false, -30.06f, 28.25f)
                arcToRelative(83.62f, 83.62f, 0.0f, false, true, -18.3f, -43.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.0f, -17.88f)
                lineToRelative(-20.0f, -20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-20.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.83f, 17.1f)
                arcToRelative(107.88f, 107.88f, 0.0f, false, false, 37.72f, 73.61f)
                arcToRelative(12.33f, 12.33f, 0.0f, false, false, 1.88f, 1.57f)
                arcToRelative(107.82f, 107.82f, 0.0f, false, false, 136.47f, -0.26f)
                arcToRelative(13.09f, 13.09f, 0.0f, false, false, 1.28f, -1.06f)
                arcToRelative(107.66f, 107.66f, 0.0f, false, false, 18.0f, -19.46f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 213.0f, 174.26f)
                close()
                moveTo(128.0f, 96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 96.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.52f, 83.52f, 0.0f, false, true, -46.94f, -14.37f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 93.88f, 0.0f)
                arcTo(84.07f, 84.07f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(252.49f, 136.49f)
                lineTo(232.49f, 156.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-20.0f, -20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.0f, -17.88f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 59.74f, 79.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 40.26f, 65.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, true, 195.4f, 54.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.83f, 17.1f)
                close()
            }
        }
        .build()
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
