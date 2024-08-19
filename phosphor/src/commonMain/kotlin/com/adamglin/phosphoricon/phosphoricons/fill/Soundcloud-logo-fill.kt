package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Soundcloud-logo-fill`: ImageVector
    get() {
        if (`_soundcloud-logo-fill` != null) {
            return `_soundcloud-logo-fill`!!
        }
        `_soundcloud-logo-fill` = Builder(name = "Soundcloud-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(8.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(48.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 88.0f)
                close()
                moveTo(80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(72.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 80.0f)
                close()
                moveTo(112.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(104.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(120.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 48.0f)
                close()
                moveTo(222.84f, 106.34f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 144.0f, 40.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(136.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(67.21f)
                curveToRelative(25.58f, 0.0f, 47.27f, -19.72f, 48.71f, -45.26f)
                arcTo(48.06f, 48.06f, 0.0f, false, false, 222.84f, 106.34f)
                close()
            }
        }
        .build()
        return `_soundcloud-logo-fill`!!
    }

private var `_soundcloud-logo-fill`: ImageVector? = null
