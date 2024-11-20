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

public val ThinGroup.UserSound: ImageVector
    get() {
        if (_userSound != null) {
            return _userSound!!
        }
        _userSound = Builder(name = "UserSound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.17f, 166.84f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -50.34f, 0.0f)
                curveToRelative(-23.76f, 5.46f, -45.18f, 18.69f, -61.89f, 38.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.12f, 5.14f)
                curveTo(48.0f, 185.7f, 76.71f, 172.0f, 108.0f, 172.0f)
                reflectiveCurveToRelative(60.0f, 13.7f, 80.94f, 38.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.12f, -5.14f)
                curveTo(178.35f, 185.53f, 156.93f, 172.3f, 133.17f, 166.84f)
                close()
                moveTo(52.0f, 108.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, 56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 52.0f, 108.0f)
                close()
                moveTo(203.68f, 67.17f)
                arcToRelative(104.35f, 104.35f, 0.0f, false, true, 0.0f, 81.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.68f, 2.43f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, true, -1.57f, -0.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.11f, -5.25f)
                arcToRelative(96.32f, 96.32f, 0.0f, false, false, 0.0f, -75.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.36f, -3.14f)
                close()
                moveTo(244.0f, 108.0f)
                arcToRelative(135.2f, 135.2f, 0.0f, false, true, -11.0f, 53.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.68f, 2.42f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -1.57f, -0.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.1f, -5.26f)
                arcToRelative(128.44f, 128.44f, 0.0f, false, false, 0.0f, -100.84f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 233.0f, 54.42f)
                arcTo(135.2f, 135.2f, 0.0f, false, true, 244.0f, 108.0f)
                close()
            }
        }
        .build()
        return _userSound!!
    }

private var _userSound: ImageVector? = null
