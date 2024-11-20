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

public val BoldGroup.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) {
            return _folderSimpleStar!!
        }
        _folderSimpleStar = Builder(name = "FolderSimpleStar", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 68.0f)
                lineTo(44.0f, 196.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(93.33f, 44.0f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, true, 12.0f, 4.0f)
                lineTo(132.0f, 68.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(212.0f, 92.0f)
                lineTo(128.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.2f, -2.4f)
                lineTo(92.0f, 68.0f)
                close()
                moveTo(239.64f, 170.87f)
                lineToRelative(-20.58f, 17.0f)
                lineToRelative(6.25f, 25.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.73f, 13.22f)
                lineTo(184.0f, 212.46f)
                lineToRelative(-23.58f, 13.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.73f, -13.22f)
                lineToRelative(6.25f, -25.26f)
                lineToRelative(-20.58f, -17.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.72f, -21.22f)
                lineToRelative(27.42f, -2.12f)
                lineTo(173.0f, 123.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.0f, 0.0f)
                lineToRelative(10.48f, 24.29f)
                lineToRelative(27.42f, 2.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.72f, 21.22f)
                close()
                moveTo(201.44f, 171.29f)
                lineTo(196.44f, 170.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.09f, -7.21f)
                lineToRelative(-2.33f, -5.4f)
                lineToRelative(-2.33f, 5.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.1f, 7.21f)
                lineToRelative(-5.0f, 0.39f)
                lineToRelative(3.48f, 2.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.0f, 12.13f)
                lineToRelative(-1.21f, 4.89f)
                lineToRelative(5.07f, -3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.18f, 0.0f)
                lineToRelative(5.07f, 3.0f)
                lineTo(194.0f, 186.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.0f, -12.13f)
                close()
            }
        }
        .build()
        return _folderSimpleStar!!
    }

private var _folderSimpleStar: ImageVector? = null
