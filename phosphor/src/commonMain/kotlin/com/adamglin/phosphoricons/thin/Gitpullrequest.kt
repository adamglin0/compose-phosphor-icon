package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Gitpullrequest: ImageVector
    get() {
        if (_gitpullrequest != null) {
            return _gitpullrequest!!
        }
        _gitpullrequest = Builder(name = "Gitpullrequest", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 64.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 68.0f, 91.71f)
                verticalLineToRelative(72.58f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(76.0f, 91.71f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 100.0f, 64.0f)
                close()
                moveTo(52.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 72.0f, 84.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 52.0f, 64.0f)
                close()
                moveTo(92.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 92.0f, 192.0f)
                close()
                moveTo(204.0f, 164.29f)
                lineTo(204.0f, 110.63f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, -5.86f, -14.15f)
                lineTo(153.66f, 52.0f)
                lineTo(192.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(144.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(140.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(148.0f, 57.66f)
                lineToRelative(44.49f, 44.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.51f, 8.49f)
                verticalLineToRelative(53.66f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f)
                close()
                moveTo(200.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 200.0f, 212.0f)
                close()
            }
        }
        .build()
        return _gitpullrequest!!
    }

private var _gitpullrequest: ImageVector? = null
