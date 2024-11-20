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

public val FillGroup.UserSound: ImageVector
    get() {
        if (_userSound != null) {
            return _userSound!!
        }
        _userSound = Builder(name = "UserSound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.13f, 202.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 216.0f)
                lineTo(24.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.12f, -13.15f)
                curveToRelative(14.94f, -17.78f, 33.52f, -30.41f, 54.17f, -37.17f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 71.9f, 0.0f)
                curveTo(164.6f, 172.44f, 183.18f, 185.07f, 198.13f, 202.85f)
                close()
                moveTo(196.86f, 61.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.22f, 10.5f)
                arcToRelative(92.26f, 92.26f, 0.0f, false, true, 0.0f, 72.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.72f, 6.29f)
                arcToRelative(108.36f, 108.36f, 0.0f, false, false, 0.0f, -84.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 196.86f, 61.39f)
                close()
                moveTo(236.71f, 52.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.7f, 6.3f)
                arcToRelative(124.43f, 124.43f, 0.0f, false, true, 0.0f, 97.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.7f, 6.3f)
                arcToRelative(140.34f, 140.34f, 0.0f, false, false, 0.0f, -110.3f)
                close()
            }
        }
        .build()
        return _userSound!!
    }

private var _userSound: ImageVector? = null
