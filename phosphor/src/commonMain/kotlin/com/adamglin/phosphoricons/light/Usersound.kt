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

public val LightGroup.UserSound: ImageVector
    get() {
        if (_userSound != null) {
            return _userSound!!
        }
        _userSound = Builder(name = "UserSound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(139.0f, 166.26f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, false, -62.0f, 0.0f)
                curveToRelative(-22.0f, 6.22f, -41.88f, 19.15f, -57.61f, 37.88f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.18f, 7.72f)
                curveTo(49.11f, 187.45f, 77.31f, 174.0f, 108.0f, 174.0f)
                reflectiveCurveToRelative(58.9f, 13.45f, 79.41f, 37.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.18f, -7.72f)
                curveTo(180.86f, 185.41f, 161.0f, 172.48f, 139.0f, 166.26f)
                close()
                moveTo(54.0f, 108.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, 54.0f, 54.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, true, 54.0f, 108.0f)
                close()
                moveTo(205.52f, 66.39f)
                arcToRelative(106.33f, 106.33f, 0.0f, false, true, 0.0f, 83.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, -4.71f)
                arcToRelative(94.29f, 94.29f, 0.0f, false, false, 0.0f, -73.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.0f, -4.71f)
                close()
                moveTo(246.0f, 108.0f)
                arcToRelative(137.16f, 137.16f, 0.0f, false, true, -11.12f, 54.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, -4.74f)
                arcToRelative(126.41f, 126.41f, 0.0f, false, false, 0.0f, -99.26f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.0f, -4.74f)
                arcTo(137.16f, 137.16f, 0.0f, false, true, 246.0f, 108.0f)
                close()
            }
        }
        .build()
        return _userSound!!
    }

private var _userSound: ImageVector? = null
