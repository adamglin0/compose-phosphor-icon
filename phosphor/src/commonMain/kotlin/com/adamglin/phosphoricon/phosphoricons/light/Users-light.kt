package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Users-light`: ImageVector
    get() {
        if (`_users-light` != null) {
            return `_users-light`!!
        }
        `_users-light` = Builder(name = "Users-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.6f, 158.43f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, false, -57.2f, 0.0f)
                arcTo(93.83f, 93.83f, 0.0f, false, false, 5.21f, 196.72f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.05f, 6.56f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, true, 137.48f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.0f, -6.56f)
                arcTo(93.83f, 93.83f, 0.0f, false, false, 112.6f, 158.43f)
                close()
                moveTo(38.0f, 108.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 46.0f, 46.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, true, 38.0f, 108.0f)
                close()
                moveTo(249.0f, 205.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.3f, -1.74f)
                arcTo(81.8f, 81.8f, 0.0f, false, false, 172.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, -17.08f, -88.73f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -4.46f, -11.14f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 50.14f, 104.3f)
                arcToRelative(93.83f, 93.83f, 0.0f, false, true, 50.19f, 38.29f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 249.0f, 205.0f)
                close()
            }
        }
        .build()
        return `_users-light`!!
    }

private var `_users-light`: ImageVector? = null
