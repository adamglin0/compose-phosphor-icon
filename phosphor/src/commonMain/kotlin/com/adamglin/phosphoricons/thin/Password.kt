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

public val ThinGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 56.0f)
                lineTo(44.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(141.2f, 114.31f)
                lineTo(116.0f, 122.49f)
                lineTo(116.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(26.49f)
                lineToRelative(-25.2f, -8.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.47f, 7.61f)
                lineToRelative(25.2f, 8.18f)
                lineTo(90.0f, 151.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.47f, 4.7f)
                lineTo(112.0f, 134.81f)
                lineToRelative(15.57f, 21.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.24f, 1.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.23f, -6.35f)
                lineTo(118.47f, 130.1f)
                lineToRelative(25.2f, -8.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.47f, -7.61f)
                close()
                moveTo(242.2f, 116.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, -2.57f)
                lineTo(212.0f, 122.49f)
                lineTo(212.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(26.49f)
                lineToRelative(-25.2f, -8.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.47f, 7.61f)
                lineToRelative(25.2f, 8.18f)
                lineTo(186.0f, 151.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.47f, 4.7f)
                lineTo(208.0f, 134.81f)
                lineToRelative(15.57f, 21.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.24f, 1.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.23f, -6.35f)
                lineTo(214.47f, 130.1f)
                lineToRelative(25.2f, -8.18f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 242.24f, 116.88f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
