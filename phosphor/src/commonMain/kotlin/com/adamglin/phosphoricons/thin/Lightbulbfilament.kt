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

public val ThinGroup.Lightbulbfilament: ImageVector
    get() {
        if (_lightbulbfilament != null) {
            return _lightbulbfilament!!
        }
        _lightbulbfilament = Builder(name = "Lightbulbfilament", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 232.0f)
                close()
                moveTo(212.0f, 104.0f)
                arcToRelative(83.59f, 83.59f, 0.0f, false, true, -32.11f, 66.06f)
                arcTo(20.2f, 20.2f, 0.0f, false, false, 172.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -7.76f, -15.81f)
                arcTo(83.58f, 83.58f, 0.0f, false, true, 44.0f, 104.47f)
                curveTo(43.75f, 59.0f, 80.52f, 21.09f, 126.0f, 20.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 86.0f, 84.0f)
                close()
                moveTo(204.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -77.84f, -76.0f)
                curveTo(85.0f, 29.0f, 51.77f, 63.27f, 52.0f, 104.43f)
                arcToRelative(75.62f, 75.62f, 0.0f, false, false, 29.17f, 59.43f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 92.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(28.0f)
                lineTo(124.0f, 145.66f)
                lineTo(93.17f, 114.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(128.0f, 138.34f)
                lineToRelative(29.17f, -29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineTo(132.0f, 145.66f)
                lineTo(132.0f, 196.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(28.14f, 28.14f, 0.0f, false, true, 10.94f, -22.2f)
                arcTo(75.62f, 75.62f, 0.0f, false, false, 204.0f, 104.0f)
                close()
            }
        }
        .build()
        return _lightbulbfilament!!
    }

private var _lightbulbfilament: ImageVector? = null
