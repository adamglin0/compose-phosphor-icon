package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.UserCheck: ImageVector
    get() {
        if (_userCheck != null) {
            return _userCheck!!
        }
        _userCheck = Builder(name = "UserCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.66f, 133.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(216.0f, 148.69f)
                lineToRelative(26.34f, -26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(144.0f, 157.68f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -71.9f, 0.0f)
                curveToRelative(-20.65f, 6.76f, -39.23f, 19.39f, -54.17f, 37.17f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 208.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.13f, -13.15f)
                curveTo(183.18f, 177.07f, 164.6f, 164.44f, 144.0f, 157.68f)
                close()
            }
        }
        .build()
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
