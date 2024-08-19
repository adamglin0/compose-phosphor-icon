package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Users-thin`: ImageVector
    get() {
        if (`_users-thin` != null) {
            return `_users-thin`!!
        }
        `_users-thin` = Builder(name = "Users-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.19f, 159.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -46.38f, 0.0f)
                arcTo(91.83f, 91.83f, 0.0f, false, false, 6.88f, 197.81f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.7f, 4.37f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 140.84f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.7f, -4.37f)
                arcTo(91.83f, 91.83f, 0.0f, false, false, 107.19f, 159.0f)
                close()
                moveTo(36.0f, 108.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 36.0f, 108.0f)
                close()
                moveTo(248.0f, 203.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.53f, -1.17f)
                arcTo(83.81f, 83.81f, 0.0f, false, false, 172.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -17.82f, -92.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.0f, -7.43f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 44.0f, 103.0f)
                arcToRelative(91.83f, 91.83f, 0.0f, false, true, 53.93f, 38.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 248.0f, 203.35f)
                close()
            }
        }
        .build()
        return `_users-thin`!!
    }

private var `_users-thin`: ImageVector? = null
