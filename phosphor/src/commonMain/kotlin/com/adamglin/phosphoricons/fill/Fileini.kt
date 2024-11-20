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

public val FillGroup.FileIni: ImageVector
    get() {
        if (_fileIni != null) {
            return _fileIni!!
        }
        _fileIni = Builder(name = "FileIni", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 152.0f)
                verticalLineToRelative(55.73f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 40.53f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 208.0f)
                lineTo(32.0f, 152.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 39.47f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 152.0f)
                close()
                moveTo(119.47f, 144.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, -7.47f, 8.25f)
                lineTo(112.0f, 183.0f)
                lineTo(86.69f, 147.6f)
                arcToRelative(8.26f, 8.26f, 0.0f, false, false, -8.0f, -3.48f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 152.0f)
                verticalLineToRelative(55.73f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 79.47f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 208.0f)
                lineTo(88.0f, 177.0f)
                lineToRelative(25.49f, 35.69f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 123.87f, 215.0f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, 4.13f, -7.25f)
                lineTo(128.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 119.47f, 144.0f)
                close()
                moveTo(159.47f, 144.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, -7.47f, 8.25f)
                verticalLineToRelative(55.46f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f)
                lineTo(168.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 159.47f, 144.0f)
                close()
                moveTo(216.0f, 88.0f)
                lineTo(216.0f, 223.75f)
                arcToRelative(8.15f, 8.15f, 0.0f, false, true, -6.81f, 8.16f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 224.0f)
                lineTo(200.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(44.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f)
                lineToRelative(56.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f)
                close()
                moveTo(196.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineTo(152.0f, 88.0f)
                close()
            }
        }
        .build()
        return _fileIni!!
    }

private var _fileIni: ImageVector? = null
