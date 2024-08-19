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

public val BoldGroup.Carbattery: ImageVector
    get() {
        if (_carbattery != null) {
            return _carbattery!!
        }
        _carbattery = Builder(name = "Carbattery", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 140.0f)
                close()
                moveTo(100.0f, 128.0f)
                horizontalLineTo(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(244.0f, 92.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineTo(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(92.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 32.0f, 72.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 64.0f, 36.0f)
                horizontalLineTo(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineTo(72.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineTo(72.0f)
                horizontalLineToRelative(12.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 244.0f, 92.0f)
                close()
                moveTo(164.0f, 72.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(164.0f)
                close()
                moveTo(68.0f, 72.0f)
                horizontalLineTo(92.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(68.0f)
                close()
                moveTo(220.0f, 96.0f)
                horizontalLineTo(36.0f)
                verticalLineToRelative(84.0f)
                horizontalLineTo(220.0f)
                close()
            }
        }
        .build()
        return _carbattery!!
    }

private var _carbattery: ImageVector? = null
