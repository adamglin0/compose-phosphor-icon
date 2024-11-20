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

public val LightGroup.UserCheck: ImageVector
    get() {
        if (_userCheck != null) {
            return _userCheck!!
        }
        _userCheck = Builder(name = "UserCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(139.0f, 158.25f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, false, -62.0f, 0.0f)
                curveToRelative(-22.0f, 6.23f, -41.88f, 19.16f, -57.61f, 37.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.18f, 7.72f)
                curveTo(49.11f, 179.44f, 77.31f, 166.0f, 108.0f, 166.0f)
                reflectiveCurveToRelative(58.9f, 13.44f, 79.41f, 37.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.18f, -7.72f)
                curveTo(180.86f, 177.41f, 161.0f, 164.48f, 139.0f, 158.25f)
                close()
                moveTo(54.0f, 100.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, 54.0f, 54.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, true, 54.0f, 100.0f)
                close()
                moveTo(252.24f, 132.24f)
                lineTo(220.24f, 164.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(216.0f, 151.51f)
                lineToRelative(27.76f, -27.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, 8.48f)
                close()
            }
        }
        .build()
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
