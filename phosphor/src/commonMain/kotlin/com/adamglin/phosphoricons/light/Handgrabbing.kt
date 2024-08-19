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

public val LightGroup.Handgrabbing: ImageVector
    get() {
        if (_handgrabbing != null) {
            return _handgrabbing!!
        }
        _handgrabbing = Builder(name = "Handgrabbing", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 82.0f)
                arcToRelative(25.85f, 25.85f, 0.0f, false, false, -14.59f, 4.49f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 128.0f, 75.41f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 82.0f, 92.0f)
                verticalLineToRelative(22.0f)
                lineTo(68.0f, 114.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, 26.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                lineTo(214.0f, 108.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 188.0f, 82.0f)
                close()
                moveTo(202.0f, 152.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, -148.0f, 0.0f)
                lineTo(54.0f, 140.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, -14.0f)
                lineTo(82.0f, 126.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(94.0f, 92.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 92.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(174.0f, 108.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handgrabbing!!
    }

private var _handgrabbing: ImageVector? = null
