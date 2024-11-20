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

public val BoldGroup.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) {
            return _pencilCircle!!
        }
        _pencilCircle = Builder(name = "PencilCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.37f, 51.6f)
                arcTo(108.08f, 108.08f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.09f, 108.09f, 0.0f, false, false, 204.37f, 51.6f)
                close()
                moveTo(92.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                verticalLineToRelative(11.11f)
                arcToRelative(83.78f, 83.78f, 0.0f, false, true, -24.0f, -7.22f)
                close()
                moveTo(140.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                verticalLineToRelative(3.89f)
                arcToRelative(83.78f, 83.78f, 0.0f, false, true, -24.0f, 7.22f)
                close()
                moveTo(106.14f, 148.0f)
                horizontalLineToRelative(43.72f)
                lineToRelative(7.57f, 16.42f)
                arcTo(35.95f, 35.95f, 0.0f, false, false, 128.0f, 173.22f)
                arcToRelative(35.95f, 35.95f, 0.0f, false, false, -29.43f, -8.79f)
                close()
                moveTo(117.22f, 124.0f)
                lineTo(128.0f, 100.62f)
                lineTo(138.78f, 124.0f)
                close()
                moveTo(188.0f, 186.79f)
                lineTo(188.0f, 176.0f)
                arcToRelative(12.15f, 12.15f, 0.0f, false, false, -1.1f, -5.0f)
                lineToRelative(-48.0f, -104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.8f, 0.0f)
                lineTo(69.1f, 171.0f)
                arcToRelative(12.15f, 12.15f, 0.0f, false, false, -1.1f, 5.0f)
                verticalLineToRelative(10.77f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 120.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
