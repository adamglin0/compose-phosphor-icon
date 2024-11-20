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

public val BoldGroup.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) {
            return _musicNotesPlus!!
        }
        _musicNotesPlus = Builder(name = "MusicNotesPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(212.0f, 60.0f)
                lineTo(212.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(188.0f, 60.0f)
                lineTo(176.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(12.0f)
                lineTo(188.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(212.0f, 36.0f)
                horizontalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 48.0f)
                close()
                moveTo(220.0f, 112.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -24.0f, -36.65f)
                lineTo(196.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(196.0f, 164.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 196.0f, 164.0f)
                close()
                moveTo(92.0f, 113.37f)
                lineTo(92.0f, 196.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -24.0f, -36.65f)
                lineTo(68.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.09f, -11.64f)
                lineToRelative(56.0f, -14.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.82f, 23.28f)
                lineTo(92.0f, 65.37f)
                lineTo(92.0f, 88.63f)
                lineToRelative(65.09f, -16.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.82f, 23.28f)
                close()
                moveTo(68.0f, 196.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 68.0f, 196.0f)
                close()
            }
        }
        .build()
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
