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

public val BoldGroup.Sliders: ImageVector
    get() {
        if (_sliders != null) {
            return _sliders!!
        }
        _sliders = Builder(name = "Sliders", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 102.06f)
                lineTo(68.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(62.06f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 67.88f)
                lineTo(44.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(68.0f, 169.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -67.88f)
                close()
                moveTo(56.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 148.0f)
                close()
                moveTo(164.0f, 88.0f)
                arcToRelative(36.07f, 36.07f, 0.0f, false, false, -24.0f, -33.94f)
                lineTo(140.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 54.06f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 67.88f)
                lineTo(116.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 121.94f)
                arcTo(36.07f, 36.07f, 0.0f, false, false, 164.0f, 88.0f)
                close()
                moveTo(128.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 100.0f)
                close()
                moveTo(236.0f, 168.0f)
                arcToRelative(36.07f, 36.07f, 0.0f, false, false, -24.0f, -33.94f)
                lineTo(212.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(94.06f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 67.88f)
                lineTo(188.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(212.0f, 201.94f)
                arcTo(36.07f, 36.07f, 0.0f, false, false, 236.0f, 168.0f)
                close()
                moveTo(200.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 180.0f)
                close()
            }
        }
        .build()
        return _sliders!!
    }

private var _sliders: ImageVector? = null
