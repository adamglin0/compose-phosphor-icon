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

public val ThinGroup.`Android-logo-thin`: ImageVector
    get() {
        if (`_android-logo-thin` != null) {
            return `_android-logo-thin`!!
        }
        `_android-logo-thin` = Builder(name = "Android-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 148.0f)
                close()
                moveTo(92.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 92.0f, 140.0f)
                close()
                moveTo(236.0f, 160.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(32.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(20.0f, 161.13f)
                arcTo(109.43f, 109.43f, 0.0f, false, true, 57.18f, 78.84f)
                lineToRelative(-28.0f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(63.41f, 73.75f)
                arcTo(106.63f, 106.63f, 0.0f, false, true, 127.62f, 52.0f)
                lineTo(128.0f, 52.0f)
                arcToRelative(107.16f, 107.16f, 0.0f, false, true, 64.78f, 21.57f)
                lineToRelative(28.39f, -28.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineTo(199.0f, 78.64f)
                curveToRelative(1.78f, 1.56f, 3.52f, 3.17f, 5.21f, 4.86f)
                arcTo(107.25f, 107.25f, 0.0f, false, true, 236.0f, 160.0f)
                close()
                moveTo(228.0f, 160.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 128.0f, 60.0f)
                horizontalLineToRelative(-0.35f)
                curveTo(72.7f, 60.19f, 28.0f, 105.56f, 28.0f, 161.13f)
                lineTo(28.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(224.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return `_android-logo-thin`!!
    }

private var `_android-logo-thin`: ImageVector? = null
