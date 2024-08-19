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

public val ThinGroup.Paintroller: ImageVector
    get() {
        if (_paintroller != null) {
            return _paintroller!!
        }
        _paintroller = Builder(name = "Paintroller", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 92.0f)
                lineTo(212.0f, 92.0f)
                lineTo(212.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(48.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 64.0f)
                lineTo(36.0f, 92.0f)
                lineTo(16.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(36.0f, 100.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 100.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, 3.84f)
                lineTo(132.7f, 186.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 124.0f, 198.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 198.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.9f, -3.84f)
                lineTo(235.3f, 165.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 154.0f)
                lineTo(244.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 92.0f)
                close()
                moveTo(204.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(200.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _paintroller!!
    }

private var _paintroller: ImageVector? = null
