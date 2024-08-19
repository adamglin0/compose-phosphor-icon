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

public val LightGroup.Clockuser: ImageVector
    get() {
        if (_clockuser != null) {
            return _clockuser!!
        }
        _clockuser = Builder(name = "Clockuser", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 72.0f)
                verticalLineToRelative(46.29f)
                lineToRelative(39.32f, -19.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.36f, 10.74f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 122.0f, 128.0f)
                lineTo(122.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(229.8f, 222.46f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.6f, 3.08f)
                curveTo(215.14f, 214.0f, 204.37f, 206.0f, 192.0f, 206.0f)
                reflectiveCurveToRelative(-23.14f, 8.0f, -26.2f, 19.54f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 160.0f, 230.0f)
                arcToRelative(6.26f, 6.26f, 0.0f, false, true, -1.54f, -0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.26f, -7.34f)
                arcTo(38.09f, 38.09f, 0.0f, false, true, 172.72f, 199.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 38.56f, 0.0f)
                arcTo(38.09f, 38.09f, 0.0f, false, true, 229.8f, 222.46f)
                close()
                moveTo(174.0f, 176.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, false, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 174.0f, 176.0f)
                close()
            }
        }
        .build()
        return _clockuser!!
    }

private var _clockuser: ImageVector? = null
