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

public val RegularGroup.`Bell-slash`: ImageVector
    get() {
        if (`_bell-slash` != null) {
            return `_bell-slash`!!
        }
        `_bell-slash` = Builder(name = "Bell-slash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(58.82f, 63.8f)
                arcTo(79.59f, 79.59f, 0.0f, false, false, 48.0f, 104.0f)
                curveToRelative(0.0f, 35.34f, -8.26f, 62.38f, -13.81f, 71.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 200.0f)
                lineTo(88.8f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.4f, 0.0f)
                horizontalLineToRelative(15.44f)
                lineToRelative(19.44f, 21.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -22.62f, -16.0f)
                horizontalLineToRelative(45.24f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(48.0f, 184.0f)
                curveToRelative(7.7f, -13.24f, 16.0f, -43.92f, 16.0f, -80.0f)
                arcToRelative(63.65f, 63.65f, 0.0f, false, true, 6.26f, -27.62f)
                lineTo(168.09f, 184.0f)
                close()
                moveTo(214.0f, 179.27f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, -2.93f, 0.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.44f, -5.08f)
                curveTo(196.35f, 156.19f, 192.0f, 129.75f, 192.0f, 104.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 96.43f, 48.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.9f, -13.91f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 104.0f)
                curveToRelative(0.0f, 35.35f, 8.05f, 58.59f, 10.52f, 64.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 214.0f, 179.25f)
                close()
            }
        }
        .build()
        return `_bell-slash`!!
    }

private var `_bell-slash`: ImageVector? = null
