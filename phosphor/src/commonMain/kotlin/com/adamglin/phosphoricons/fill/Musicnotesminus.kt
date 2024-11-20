package com.adamglin.phosphoricons.fill

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
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.MusicNotesMinus: ImageVector
    get() {
        if (_musicNotesMinus != null) {
            return _musicNotesMinus!!
        }
        _musicNotesMinus = Builder(name = "MusicNotesMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 40.0f)
                horizontalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.13f, 76.5f)
                arcToRelative(31.57f, 31.57f, 0.0f, false, true, -16.44f, -38.76f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 141.0f, 32.53f)
                lineTo(78.06f, 48.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 56.0f)
                verticalLineTo(166.1f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 52.42f, 232.0f)
                curveTo(72.25f, 231.77f, 88.0f, 215.13f, 88.0f, 195.3f)
                verticalLineTo(102.25f)
                lineToRelative(73.26f, -18.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 162.13f, 76.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 80.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(50.1f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 180.42f, 200.0f)
                curveToRelative(19.83f, -0.23f, 35.58f, -16.86f, 35.58f, -36.7f)
                verticalLineTo(84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 212.0f, 80.0f)
                close()
            }
        }
        .build()
        return _musicNotesMinus!!
    }

private var _musicNotesMinus: ImageVector? = null
