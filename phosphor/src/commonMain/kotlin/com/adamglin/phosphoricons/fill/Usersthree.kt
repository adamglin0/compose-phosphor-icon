package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Usersthree: ImageVector
    get() {
        if (_usersthree != null) {
            return _usersthree!!
        }
        _usersthree = Builder(name = "Usersthree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.12f, 147.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.2f)
                lineTo(16.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -6.17f)
                arcToRelative(8.35f, 8.35f, 0.0f, false, true, 1.62f, -6.93f)
                arcTo(67.79f, 67.79f, 0.0f, false, true, 37.0f, 117.51f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 66.46f, -35.8f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -2.27f, 4.18f)
                arcTo(64.08f, 64.08f, 0.0f, false, false, 64.0f, 144.0f)
                curveTo(64.0f, 145.28f, 64.0f, 146.54f, 64.12f, 147.8f)
                close()
                moveTo(246.12f, 138.89f)
                arcTo(67.76f, 67.76f, 0.0f, false, false, 219.0f, 117.51f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -66.46f, -35.8f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 2.27f, 4.18f)
                arcTo(64.08f, 64.08f, 0.0f, false, true, 192.0f, 144.0f)
                curveToRelative(0.0f, 1.28f, 0.0f, 2.54f, -0.12f, 3.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.2f)
                lineTo(240.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.8f, -6.17f)
                arcTo(8.33f, 8.33f, 0.0f, false, false, 246.17f, 138.89f)
                close()
                moveTo(157.12f, 182.07f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -58.37f, 0.0f)
                arcTo(72.13f, 72.13f, 0.0f, false, false, 65.07f, 212.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 224.0f)
                lineTo(184.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.93f, -12.0f)
                arcTo(72.15f, 72.15f, 0.0f, false, false, 157.19f, 182.07f)
                close()
            }
        }
        .build()
        return _usersthree!!
    }

private var _usersthree: ImageVector? = null
