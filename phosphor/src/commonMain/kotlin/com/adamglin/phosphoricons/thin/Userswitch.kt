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

public val ThinGroup.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) {
            return _userSwitch!!
        }
        _userSwitch = Builder(name = "UserSwitch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.83f, 130.83f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, -5.66f)
                lineTo(220.0f, 142.34f)
                lineTo(220.0f, 128.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 53.25f, 74.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.5f, -4.68f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 228.0f, 128.0f)
                verticalLineToRelative(14.34f)
                lineToRelative(17.17f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                close()
                moveTo(209.23f, 186.34f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 28.0f, 128.0f)
                lineTo(28.0f, 113.66f)
                lineTo(10.83f, 130.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(36.0f, 113.66f)
                lineTo(36.0f, 128.0f)
                arcToRelative(91.69f, 91.69f, 0.0f, false, false, 26.83f, 64.87f)
                arcToRelative(75.61f, 75.61f, 0.0f, false, true, 44.51f, -34.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 41.32f, 0.0f)
                arcToRelative(75.57f, 75.57f, 0.0f, false, true, 44.52f, 34.07f)
                arcToRelative(91.34f, 91.34f, 0.0f, false, false, 9.56f, -11.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.49f, 4.68f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 156.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.23f, 92.23f, 0.0f, false, false, 59.14f, -21.57f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -118.27f, 0.0f)
                arcTo(91.56f, 91.56f, 0.0f, false, false, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
