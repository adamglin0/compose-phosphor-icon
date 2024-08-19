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

public val LightGroup.Currencygbp: ImageVector
    get() {
        if (_currencygbp != null) {
            return _currencygbp!!
        }
        _currencygbp = Builder(name = "Currencygbp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 30.0f, -30.0f)
                verticalLineTo(134.0f)
                horizontalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(90.0f)
                verticalLineTo(84.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 81.81f, -38.58f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.64f, 9.26f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 102.0f, 84.0f)
                verticalLineToRelative(38.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(102.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(41.88f, 41.88f, 0.0f, false, true, -12.63f, 30.0f)
                horizontalLineTo(184.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 190.0f, 208.0f)
                close()
            }
        }
        .build()
        return _currencygbp!!
    }

private var _currencygbp: ImageVector? = null
