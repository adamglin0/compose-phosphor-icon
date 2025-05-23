package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.SpeakerSimpleLow: ImageVector
    get() {
        if (_speakerSimpleLow != null) {
            return _speakerSimpleLow!!
        }
        _speakerSimpleLow = Builder(name = "SpeakerSimpleLow", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 32.0f)
                verticalLineTo(224.0f)
                lineTo(88.0f, 168.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.51f, 24.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.42f, 0.88f)
                lineTo(85.25f, 80.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(85.25f)
                lineToRelative(69.84f, 54.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 224.0f)
                verticalLineTo(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 163.51f, 24.81f)
                close()
                moveTo(152.0f, 207.64f)
                lineTo(92.91f, 161.69f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 88.0f, 160.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(88.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, false, 4.91f, -1.69f)
                lineTo(152.0f, 48.36f)
                close()
                moveTo(208.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _speakerSimpleLow!!
    }

private var _speakerSimpleLow: ImageVector? = null
