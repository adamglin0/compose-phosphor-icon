package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Gitpullrequest: ImageVector
    get() {
        if (_gitpullrequest != null) {
            return _gitpullrequest!!
        }
        _gitpullrequest = Builder(name = "Gitpullrequest", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 64.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 66.0f, 93.4f)
                verticalLineToRelative(69.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(78.0f, 93.4f)
                arcTo(30.05f, 30.05f, 0.0f, false, false, 102.0f, 64.0f)
                close()
                moveTo(54.0f, 64.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 72.0f, 82.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 54.0f, 64.0f)
                close()
                moveTo(90.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 90.0f, 192.0f)
                close()
                moveTo(206.0f, 162.6f)
                verticalLineToRelative(-52.0f)
                arcToRelative(21.88f, 21.88f, 0.0f, false, false, -6.44f, -15.56f)
                lineTo(158.48f, 54.0f)
                lineTo(192.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(144.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(138.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(150.0f, 62.48f)
                lineToRelative(41.07f, 41.08f)
                arcToRelative(9.91f, 9.91f, 0.0f, false, true, 2.93f, 7.07f)
                verticalLineToRelative(52.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(200.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 210.0f)
                close()
            }
        }
        .build()
        return _gitpullrequest!!
    }

private var _gitpullrequest: ImageVector? = null
