package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Bell-z`: ImageVector
    get() {
        if (`_bell-z` != null) {
            return `_bell-z`!!
        }
        `_bell-z` = Builder(name = "Bell-z", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(112.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.65f, -12.44f)
                lineTo(129.05f, 104.0f)
                lineTo(112.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.65f, 12.44f)
                lineTo(127.0f, 136.0f)
                horizontalLineToRelative(17.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 144.0f)
                close()
                moveTo(221.84f, 192.0f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 208.0f, 200.0f)
                lineTo(167.19f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -78.38f, 0.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.8f, -24.06f)
                curveTo(39.75f, 166.38f, 48.0f, 139.34f, 48.0f, 104.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 160.0f, 0.0f)
                curveToRelative(0.0f, 35.33f, 8.26f, 62.38f, 13.81f, 71.94f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 221.84f, 192.0f)
                close()
                moveTo(150.62f, 200.0f)
                lineTo(105.38f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 45.24f, 0.0f)
                close()
                moveTo(208.0f, 184.0f)
                curveToRelative(-7.73f, -13.27f, -16.0f, -43.95f, -16.0f, -80.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -128.0f, 0.0f)
                curveToRelative(0.0f, 36.06f, -8.28f, 66.74f, -16.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_bell-z`!!
    }

private var `_bell-z`: ImageVector? = null
