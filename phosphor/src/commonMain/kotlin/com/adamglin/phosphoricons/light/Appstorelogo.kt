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

public val LightGroup.Appstorelogo: ImageVector
    get() {
        if (_appstorelogo != null) {
            return _appstorelogo!!
        }
        _appstorelogo = Builder(name = "Appstorelogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.62f, 195.05f)
                lineToRelative(-9.45f, 16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 42.83f, 205.0f)
                lineToRelative(9.46f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.33f, 6.1f)
                close()
                moveTo(232.0f, 154.0f)
                lineTo(183.06f, 154.0f)
                lineToRelative(-31.31f, -53.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.33f, 6.11f)
                lineToRelative(61.41f, 103.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.34f, -6.1f)
                lineToRelative(-23.0f, -38.95f)
                lineTo(232.0f, 165.99f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(142.47f, 154.0f)
                lineTo(86.88f, 154.0f)
                lineTo(157.17f, 35.05f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 146.83f, 29.0f)
                lineTo(128.0f, 60.82f)
                lineTo(109.17f, 29.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.34f, 6.1f)
                lineTo(121.0f, 72.62f)
                lineTo(72.94f, 154.0f)
                lineTo(24.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(142.47f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _appstorelogo!!
    }

private var _appstorelogo: ImageVector? = null
