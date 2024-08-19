package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Virtualreality: ImageVector
    get() {
        if (_virtualreality != null) {
            return _virtualreality!!
        }
        _virtualreality = Builder(name = "Virtualreality", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 48.0f)
                horizontalLineTo(80.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, 160.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f)
                close()
                moveTo(123.49f, 98.81f)
                lineToRelative(-24.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.0f, 0.0f)
                lineToRelative(-24.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, -5.62f)
                lineToRelative(16.51f, 44.0f)
                lineToRelative(16.51f, -44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, 5.62f)
                close()
                moveTo(191.0f, 156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.9f, 7.94f)
                lineToRelative(-11.44f, -20.0f)
                curveToRelative(-0.53f, 0.0f, -1.07f, 0.05f, -1.61f, 0.05f)
                horizontalLineTo(152.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 16.84f, 50.35f)
                close()
                moveTo(176.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(104.0f)
                horizontalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 116.0f)
                close()
            }
        }
        .build()
        return _virtualreality!!
    }

private var _virtualreality: ImageVector? = null
