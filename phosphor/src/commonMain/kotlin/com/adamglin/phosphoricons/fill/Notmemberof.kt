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

public val FillGroup.NotMemberOf: ImageVector
    get() {
        if (_notMemberOf != null) {
            return _notMemberOf!!
        }
        _notMemberOf = Builder(name = "NotMemberOf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(190.0f, 69.27f)
                lineTo(145.63f, 120.0f)
                horizontalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(131.63f)
                lineToRelative(-28.76f, 32.87f)
                arcTo(47.72f, 47.72f, 0.0f, false, false, 128.0f, 176.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(128.0f)
                arcToRelative(63.62f, 63.62f, 0.0f, false, true, -35.78f, -11.0f)
                lineTo(78.0f, 197.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.0f, -10.54f)
                lineToRelative(14.21f, -16.24f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 128.0f, 64.0f)
                horizontalLineToRelative(45.37f)
                lineTo(178.0f, 58.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.0f, 10.54f)
                close()
                moveTo(128.0f, 80.0f)
                horizontalLineToRelative(31.37f)
                lineToRelative(-35.0f, 40.0f)
                horizontalLineTo(80.68f)
                arcTo(48.07f, 48.07f, 0.0f, false, true, 128.0f, 80.0f)
                close()
                moveTo(80.68f, 136.0f)
                horizontalLineToRelative(29.69f)
                lineTo(90.84f, 158.32f)
                arcTo(47.78f, 47.78f, 0.0f, false, true, 80.68f, 136.0f)
                close()
            }
        }
        .build()
        return _notMemberOf!!
    }

private var _notMemberOf: ImageVector? = null
