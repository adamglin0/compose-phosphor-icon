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

public val LightGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.19f, 213.0f)
                curveToRelative(-15.81f, -27.32f, -40.63f, -46.49f, -69.47f, -54.62f)
                arcToRelative(70.0f, 70.0f, 0.0f, true, false, -63.44f, 0.0f)
                curveTo(67.44f, 166.5f, 42.62f, 185.67f, 26.81f, 213.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.38f, 6.0f)
                curveTo(56.4f, 185.81f, 90.34f, 166.0f, 128.0f, 166.0f)
                reflectiveCurveToRelative(71.6f, 19.81f, 90.81f, 53.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.38f, -6.0f)
                close()
                moveTo(70.0f, 96.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, true, 58.0f, 58.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, true, 70.0f, 96.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
