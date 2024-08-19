package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) {
            return _seatbelt!!
        }
        _seatbelt = Builder(name = "Seatbelt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 212.0f)
                lineTo(89.45f, 212.0f)
                lineToRelative(110.18f, -90.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -15.26f, -18.52f)
                lineToRelative(-17.78f, 14.64f)
                arcToRelative(83.34f, 83.34f, 0.0f, false, false, -17.0f, -6.55f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -43.26f, 0.0f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, false, -58.0f, 54.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.76f, 7.62f)
                arcToRelative(60.05f, 60.05f, 0.0f, false, true, 74.54f, -38.3f)
                lineToRelative(-97.26f, 80.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 236.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(204.61f, 157.51f)
                arcToRelative(83.58f, 83.58f, 0.0f, false, true, 6.88f, 25.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -23.86f, 2.64f)
                arcToRelative(59.16f, 59.16f, 0.0f, false, false, -4.9f, -17.95f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 21.88f, -9.86f)
                close()
            }
        }
        .build()
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
