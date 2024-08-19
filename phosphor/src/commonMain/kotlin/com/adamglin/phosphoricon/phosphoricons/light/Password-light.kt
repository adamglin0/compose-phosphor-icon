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

public val LightGroup.`Password-light`: ImageVector
    get() {
        if (`_password-light` != null) {
            return `_password-light`!!
        }
        `_password-light` = Builder(name = "Password-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.0f, 56.0f)
                lineTo(46.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(34.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(140.58f, 112.41f)
                lineTo(118.0f, 119.74f)
                lineTo(118.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(23.74f)
                lineToRelative(-22.58f, -7.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.71f, 11.41f)
                lineToRelative(22.58f, 7.33f)
                lineToRelative(-14.0f, 19.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.7f, 7.06f)
                lineToRelative(14.0f, -19.21f)
                lineToRelative(14.0f, 19.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.7f, -7.06f)
                lineToRelative(-14.0f, -19.21f)
                lineToRelative(22.58f, -7.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.71f, -11.41f)
                close()
                moveTo(244.14f, 116.26f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.56f, -3.85f)
                lineTo(214.0f, 119.74f)
                lineTo(214.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(23.74f)
                lineToRelative(-22.58f, -7.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.71f, 11.41f)
                lineToRelative(22.58f, 7.33f)
                lineToRelative(-13.95f, 19.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.7f, 7.06f)
                lineToRelative(14.0f, -19.21f)
                lineToRelative(14.0f, 19.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.7f, -7.06f)
                lineToRelative(-13.95f, -19.21f)
                lineToRelative(22.58f, -7.33f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 244.14f, 116.26f)
                close()
            }
        }
        .build()
        return `_password-light`!!
    }

private var `_password-light`: ImageVector? = null
