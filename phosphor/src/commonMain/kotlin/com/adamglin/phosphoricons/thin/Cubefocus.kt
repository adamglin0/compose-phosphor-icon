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

public val ThinGroup.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) {
            return _cubeFocus!!
        }
        _cubeFocus = Builder(name = "CubeFocus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 48.0f)
                lineTo(228.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(220.0f, 52.0f)
                lineTo(184.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(72.0f, 204.0f)
                lineTo(36.0f, 204.0f)
                lineTo(36.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(72.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(224.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(36.0f)
                lineTo(184.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(228.0f, 168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 164.0f)
                close()
                moveTo(32.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(36.0f, 52.0f)
                lineTo(72.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(32.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(28.0f, 88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 92.0f)
                close()
                moveTo(186.0f, 163.47f)
                lineTo(130.0f, 195.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineToRelative(-56.0f, -32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 68.0f, 160.0f)
                lineTo(68.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.0f, -3.47f)
                lineToRelative(56.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 0.0f)
                lineToRelative(56.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 188.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 186.0f, 163.47f)
                close()
                moveTo(80.06f, 96.0f)
                lineTo(128.0f, 123.39f)
                lineTo(175.94f, 96.0f)
                lineTo(128.0f, 68.61f)
                close()
                moveTo(76.0f, 157.68f)
                lineToRelative(48.0f, 27.43f)
                lineTo(124.0f, 130.32f)
                lineTo(76.0f, 102.89f)
                close()
                moveTo(180.0f, 157.68f)
                lineTo(180.0f, 102.89f)
                lineToRelative(-48.0f, 27.43f)
                verticalLineToRelative(54.79f)
                close()
            }
        }
        .build()
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
