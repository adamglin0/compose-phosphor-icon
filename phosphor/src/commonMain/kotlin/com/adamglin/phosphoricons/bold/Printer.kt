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

public val BoldGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.67f, 68.0f)
                lineTo(204.0f, 68.0f)
                lineTo(204.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(64.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 68.0f)
                lineTo(41.33f, 68.0f)
                curveTo(25.16f, 68.0f, 12.0f, 80.56f, 12.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(52.0f, 188.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(192.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(204.0f, 188.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(244.0f, 96.0f)
                curveTo(244.0f, 80.56f, 230.84f, 68.0f, 214.67f, 68.0f)
                close()
                moveTo(76.0f, 52.0f)
                lineTo(180.0f, 52.0f)
                lineTo(180.0f, 68.0f)
                lineTo(76.0f, 68.0f)
                close()
                moveTo(180.0f, 204.0f)
                lineTo(76.0f, 204.0f)
                lineTo(76.0f, 172.0f)
                lineTo(180.0f, 172.0f)
                close()
                moveTo(220.0f, 164.0f)
                lineTo(204.0f, 164.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(64.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(36.0f, 164.0f)
                lineTo(36.0f, 96.0f)
                curveToRelative(0.0f, -2.17f, 2.44f, -4.0f, 5.33f, -4.0f)
                lineTo(214.67f, 92.0f)
                curveToRelative(2.89f, 0.0f, 5.33f, 1.83f, 5.33f, 4.0f)
                close()
                moveTo(204.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 204.0f, 120.0f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
