package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`User-sound`: ImageVector
    get() {
        if (`_user-sound` != null) {
            return `_user-sound`!!
        }
        `_user-sound` = Builder(name = "User-sound", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 165.68f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -71.9f, 0.0f)
                curveToRelative(-20.65f, 6.76f, -39.23f, 19.39f, -54.17f, 37.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.25f, 10.3f)
                curveTo(50.25f, 189.19f, 77.91f, 176.0f, 108.0f, 176.0f)
                reflectiveCurveToRelative(57.75f, 13.19f, 77.88f, 37.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.25f, -10.3f)
                curveTo(183.18f, 185.07f, 164.6f, 172.44f, 144.0f, 165.68f)
                close()
                moveTo(56.0f, 108.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, 52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 56.0f, 108.0f)
                close()
                moveTo(207.36f, 65.6f)
                arcToRelative(108.36f, 108.36f, 0.0f, false, true, 0.0f, 84.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.36f, 4.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.36f, -11.15f)
                arcToRelative(92.26f, 92.26f, 0.0f, false, false, 0.0f, -72.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.72f, -6.29f)
                close()
                moveTo(248.0f, 108.0f)
                arcToRelative(139.0f, 139.0f, 0.0f, false, true, -11.29f, 55.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.7f, -6.3f)
                arcToRelative(124.43f, 124.43f, 0.0f, false, false, 0.0f, -97.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.7f, -6.3f)
                arcTo(139.0f, 139.0f, 0.0f, false, true, 248.0f, 108.0f)
                close()
            }
        }
        .build()
        return `_user-sound`!!
    }

private var `_user-sound`: ImageVector? = null
