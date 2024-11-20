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

public val ThinGroup.NotMemberOf: ImageVector
    get() {
        if (_notMemberOf != null) {
            return _notMemberOf!!
        }
        _notMemberOf = Builder(name = "NotMemberOf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.69f, 37.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 0.27f)
                lineTo(199.0f, 44.0f)
                horizontalLineTo(128.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 68.63f, 187.36f)
                lineTo(45.0f, 213.31f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 51.0f, 218.69f)
                lineToRelative(23.58f, -25.94f)
                arcTo(83.64f, 83.64f, 0.0f, false, false, 128.0f, 212.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(128.0f)
                arcToRelative(75.66f, 75.66f, 0.0f, false, true, -48.07f, -17.18f)
                lineTo(129.77f, 132.0f)
                horizontalLineTo(200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(137.0f)
                lineTo(211.0f, 42.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.69f, 37.0f)
                close()
                moveTo(74.0f, 181.43f)
                arcTo(75.7f, 75.7f, 0.0f, false, true, 52.11f, 132.0f)
                horizontalLineTo(119.0f)
                close()
                moveTo(52.11f, 124.0f)
                arcTo(76.09f, 76.09f, 0.0f, false, true, 128.0f, 52.0f)
                horizontalLineToRelative(63.69f)
                lineToRelative(-65.46f, 72.0f)
                close()
            }
        }
        .build()
        return _notMemberOf!!
    }

private var _notMemberOf: ImageVector? = null
