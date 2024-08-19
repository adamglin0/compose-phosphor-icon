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

public val LightGroup.`User-switch-light`: ImageVector
    get() {
        if (`_user-switch-light` != null) {
            return `_user-switch-light`!!
        }
        `_user-switch-light` = Builder(name = "User-switch-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.24f, 132.24f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, -8.48f)
                lineTo(218.0f, 137.51f)
                lineTo(218.0f, 128.0f)
                arcTo(90.0f, 90.0f, 0.0f, false, false, 54.87f, 75.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.74f, -7.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 230.0f, 128.0f)
                verticalLineToRelative(9.51f)
                lineToRelative(13.76f, -13.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, 8.48f)
                close()
                moveTo(210.85f, 187.5f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 26.0f, 128.0f)
                verticalLineToRelative(-9.51f)
                lineTo(12.24f, 132.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(38.0f, 118.49f)
                lineTo(38.0f, 128.0f)
                arcToRelative(89.65f, 89.65f, 0.0f, false, false, 24.49f, 61.64f)
                arcToRelative(77.53f, 77.53f, 0.0f, false, true, 40.0f, -31.38f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 51.0f, 0.0f)
                arcToRelative(77.49f, 77.49f, 0.0f, false, true, 40.0f, 31.41f)
                arcToRelative(89.35f, 89.35f, 0.0f, false, false, 7.58f, -9.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 9.74f, 7.0f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 128.0f, 154.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.24f, 90.24f, 0.0f, false, false, 56.57f, -20.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, -113.13f, 0.0f)
                arcTo(89.58f, 89.58f, 0.0f, false, false, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return `_user-switch-light`!!
    }

private var `_user-switch-light`: ImageVector? = null
