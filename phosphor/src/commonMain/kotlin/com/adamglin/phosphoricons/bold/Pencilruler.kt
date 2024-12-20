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

public val BoldGroup.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) {
            return _pencilRuler!!
        }
        _pencilRuler = Builder(name = "PencilRuler", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(160.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                lineTo(140.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(164.0f, 204.0f)
                lineTo(164.0f, 180.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(164.0f, 156.0f)
                lineTo(164.0f, 140.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(164.0f, 116.0f)
                lineTo(164.0f, 100.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(164.0f, 76.0f)
                lineTo(164.0f, 52.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(80.49f, 23.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(96.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(116.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.51f, -8.49f)
                close()
                moveTo(52.0f, 92.0f)
                lineTo(92.0f, 92.0f)
                verticalLineToRelative(72.0f)
                lineTo(52.0f, 164.0f)
                close()
                moveTo(72.0f, 49.0f)
                lineTo(91.0f, 68.0f)
                lineTo(53.0f, 68.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(52.0f, 188.0f)
                lineTo(92.0f, 188.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
