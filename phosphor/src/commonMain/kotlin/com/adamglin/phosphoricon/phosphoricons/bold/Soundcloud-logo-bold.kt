package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Soundcloud-logo-bold`: ImageVector
    get() {
        if (`_soundcloud-logo-bold` != null) {
            return `_soundcloud-logo-bold`!!
        }
        `_soundcloud-logo-bold` = Builder(name = "Soundcloud-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(8.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(60.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 96.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(72.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 84.0f)
                close()
                moveTo(100.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 56.0f)
                lineTo(88.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(112.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 44.0f)
                close()
                moveTo(222.34f, 103.33f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 140.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(59.78f, 59.78f, 0.0f, false, true, 59.7f, 53.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.66f, 10.58f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 204.0f, 180.0f)
                lineTo(140.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 18.34f, -100.67f)
                close()
            }
        }
        .build()
        return `_soundcloud-logo-bold`!!
    }

private var `_soundcloud-logo-bold`: ImageVector? = null
